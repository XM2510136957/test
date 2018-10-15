 public DownloadPic(final URL url, final Handler handler) {

        if (Environment.getExternalStorageDirectory().equals(Environment.MEDIA_MOUNTED)){
         //如果为挂载状态，那么就通过Environment的getExternalStorageDirectory()方法来获取

            if(!file.exists()){

                file.mkdir();
            }


        }
