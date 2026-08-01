// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import android.view.MotionEvent;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS36.CLS35;
import b.ˈˈ.CLS71;
import b.ـˏ.CLS169;
import b.ـˏ.CLS889;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS182;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class CLS805 implements CLS35 {
    public long FLD1196;
    public final CLS770 FLD1197;

    public CLS805(CLS770 ٴʿ0) {
        this.FLD1197 = ٴʿ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        public final class CLS804 implements CLS2 {
            public final String FLD1194;
            public final CLS805 FLD1195;

            public CLS804(String s) {
                this.FLD1194 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS889(new File(this.FLD1194))), 2, arrayList0);
                    CLS805.this.FLD1197.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                }
            }
        }

        Object object2;
        if(CLS27.MTH895().MTH938("storygallery_download", false)) {
            CLS770 ٴʿ0 = this.FLD1197;
            if(ٴʿ0.FLD1447.FLD1438.MTH6895("storygallery_download")) {
                Object object0 = arr_object[0];
                Object object1 = null;
                try {
                    Field field0 = object0.getClass().getDeclaredField("args");
                    object2 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object2 = field0.get(object0);
                    }
                }
                catch(Throwable unused_ex) {
                }
                MotionEvent motionEvent0 = (MotionEvent)((Object[])object2)[0];
                if(motionEvent0.getAction() == 0) {
                    this.FLD1196 = System.currentTimeMillis();
                    return;
                }
                if(this.FLD1196 != 0L && System.currentTimeMillis() - this.FLD1196 >= 1500L) {
                    try {
                        this.FLD1196 = 0L;
                        Field field1 = object0.getClass().getDeclaredField("thisObject");
                        if(field1 != null) {
                            field1.setAccessible(true);
                            object1 = field1.get(object0);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    String s = (String)CLS182.MTH3492(4101736980071371573L, CLS182.MTH3492(4101737448222806837L, CLS182.MTH3492(0x38EC4C672B3CD335L, CLS182.MTH3492(4101737285014049589L, object1))));
                    if(TextUtils.isEmpty(s)) {
                        return;
                    }
                    CLS71 ˆٴ0 = new CLS71(((CLS140)ٴʿ0).MTH3042(), CLS27.MTH889("appname"));
                    if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
                        ˆٴ0.MTH1572("download", ((CLS3)new CLS747(this, s, 0)));
                    }
                    ˆٴ0.MTH1572("forward_chat_to_sns", ((CLS3)new CLS747(this, s, 1)));
                    ˆٴ0.MTH1572("forward_to_friends", ((CLS3)new CLS747(this, s, 2)));
                    ˆٴ0.MTH1572("share", ((CLS3)new CLS747(this, s, 3)));
                    ˆٴ0.MTH1573();
                }
                if(motionEvent0.getAction() == 1) {
                    this.FLD1196 = 0L;
                }
            }
        }
    }
}

