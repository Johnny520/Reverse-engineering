// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.os.Environment;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS568;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS848;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1424;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS963 implements CLS3 {
    public final int FLD1871;
    public final Activity FLD1872;
    public final CLS1062 FLD1873;

    public CLS963(CLS1062 יٴ0, Activity activity0, int v) {
        this.FLD1871 = v;
        this.FLD1873 = יٴ0;
        this.FLD1872 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD1872;
        CLS1062 יٴ0 = this.FLD1873;
        switch(this.FLD1871) {
            case 0: {
                יٴ0.getClass();
                CLS29 ˎᵢ0 = CLS27.MTH895();
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                arrayList0.add("mp3");
                arrayList0.add("acc");
                arrayList0.add("wav");
                arrayList0.add("flac");
                arrayList0.add("ogg");
                arrayList0.add("m4a");
                arrayList1.add("audio/x-m4a");
                arrayList1.add("audio/mp3");
                arrayList1.add("audio/mpeg3");
                arrayList1.add("audio/mpg");
                arrayList1.add("audio/wav");
                arrayList1.add("audio/wave");
                arrayList1.add("audio/mp4a");
                arrayList1.add("audio/ogg");
                arrayList1.add("audio/flac");
                arrayList1.add("audio/x-flac");
                arrayList1.add("audio/*");
                if(CLS500.FLD4928.MTH6895("extract_vid_audio")) {
                    arrayList0.add("mkv");
                    arrayList0.add("mp4");
                    arrayList1.add("video/mp4");
                    arrayList1.add("video/x-matroska");
                    arrayList1.add("video/*");
                }
                CLS1210 ﾞʽ0 = new CLS1210(ˎᵢ0, activity0, ((CLS12)new CLS568(((CLS219)יٴ0), activity0, 10)), 0);
                String s = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                String s1 = ˎᵢ0.MTH925("mp3_last_dir", "");
                CLS31.MTH1000(activity0, ((CLS17)ﾞʽ0), ((String[])arrayList0.toArray(new String[0])), ((String[])arrayList1.toArray(new String[0])), s, s1);
                return;
            }
            case 1: {
                יٴ0.getClass();
                CLS81 יᐧ0 = new CLS81(CLS47.FLD167.MTH1197());
                ArrayList arrayList2 = new ArrayList();
                CLS369 ﾞᵎ0 = new CLS369(activity0, arrayList2);
                CLS897 ʻ0 = new CLS897(activity0, יᐧ0, arrayList2, ﾞᵎ0, 0);
                CLS1092 ٴٴ0 = new CLS1092(יٴ0, יᐧ0);
                CLS523.MTH7160(activity0, CLS27.MTH889("add_silk"), ((CLS17)new CLS612(activity0, יᐧ0, ʻ0, ﾞᵎ0, 24, 0)), ((CLS11)ٴٴ0));
                return;
            }
            case 2: {
                יٴ0.getClass();
                CLS948 ʿʽ0 = new CLS948(יٴ0, 0);
                CLS29 ˎᵢ1 = CLS27.MTH895();
                CLS31.MTH1000(activity0, ((CLS17)new CLS1210(ˎᵢ1, activity0, ((CLS12)new CLS1424(((CLS3)ʿʽ0), 1)), 1)), new String[]{"silk", "slk", "amr"}, new String[]{"audio/silk", "audio/amr"}, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath(), ˎᵢ1.MTH925("silk_last_dir", ""));
                return;
            }
            case 3: {
                יٴ0.getClass();
                File file0 = new File(CLS31.MTH1038(activity0), "sfTempDir");
                CLS31.MTH974(activity0, new CLS957(activity0, file0, ((CLS3)new CLS848(יٴ0, file0, new HashMap(), activity0, 4)), 0));
                return;
            }
            case 4: {
                יٴ0.getClass();
                File file1 = new File(activity0.getCacheDir(), "wx_sounds_export");
                ArrayList arrayList3 = new ArrayList();
                for(Object object1: CLS47.FLD167.MTH1198()) {
                    CLS81 יᐧ1 = (CLS81)object1;
                    if(יᐧ1.FLD312 == 1) {
                        arrayList3.add(יᐧ1);
                    }
                }
                CLS1062.MTH4023(activity0, CLS27.MTH889("export_"), arrayList3, ((CLS8)new CLS984(file1, activity0)));
                return;
            }
            case 5: {
                יٴ0.getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS993(יٴ0)));
                return;
            }
            default: {
                יٴ0.getClass();
                HashSet hashSet0 = new HashSet();
                for(Object object0: יٴ0.FLD2276.MTH1198()) {
                    hashSet0.addAll(((CLS81)object0).FLD309);
                }
                if(!hashSet0.isEmpty()) {
                    CLS523.MTH7163(true, activity0, CLS27.MTH889("tags"), new ArrayList(hashSet0), ((CLS7)new CLS1156(יٴ0, activity0, 12)));
                }
            }
        }
    }
}

