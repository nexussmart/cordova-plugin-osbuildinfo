function Plugin(){}

Plugin.getInfo = function(cb){
  var onSuccess = function(productname){
    cb(productname);
  };
  var onFail = function(){};
  var empty = "";
  cordova.exec(onSuccess, onFail, 'OSBuildInfo', 'getInfo', [empty]);
};

module.exports = Plugin;
