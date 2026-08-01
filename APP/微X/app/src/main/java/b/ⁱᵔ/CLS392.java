// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʾᵢ.CLS27;
import java.io.StringReader;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class CLS392 {
    public static final class CLS391 {
        public final HashMap FLD3676;
        public final XmlPullParser FLD3677;
        public final HashMap FLD3678;
        public StringBuilder FLD3679;

        public CLS391(String s) {
            this.FLD3679 = new StringBuilder();
            try {
                ThreadLocal threadLocal0 = CLS392.FLD3680;
                XmlPullParser xmlPullParser0 = (XmlPullParser)threadLocal0.get();
                this.FLD3677 = xmlPullParser0;
                if(xmlPullParser0 == null) {
                    XmlPullParser xmlPullParser1 = XmlPullParserFactory.newInstance().newPullParser();
                    this.FLD3677 = xmlPullParser1;
                    threadLocal0.set(xmlPullParser1);
                }
                StringReader stringReader0 = new StringReader(s);
                this.FLD3677.setInput(stringReader0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            this.FLD3678 = new HashMap();
            this.FLD3676 = new HashMap();
        }

        public final HashMap MTH5631() {
            int v1;
            int v;
            XmlPullParser xmlPullParser0;
            HashMap hashMap0;
            try {
                hashMap0 = this.FLD3676;
                xmlPullParser0 = this.FLD3677;
                v = xmlPullParser0.getEventType();
                while(true) {
                label_3:
                    if(v == 1) {
                        return hashMap0;
                    }
                    v1 = xmlPullParser0.next();
                    if(v1 == 2) {
                        break;
                    }
                    else {
                        goto label_26;
                    }
                    v = v1;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return hashMap0;
            }
            try {
                StringBuilder stringBuilder0 = this.FLD3679;
                stringBuilder0.append('.');
                stringBuilder0.append(xmlPullParser0.getName());
                String s = this.FLD3679.toString();
                HashMap hashMap1 = this.FLD3678;
                Integer integer0 = (Integer)hashMap1.get(s);
                if(integer0 == null) {
                    hashMap1.put(s, 0);
                }
                else {
                    Integer integer1 = (int)(((int)integer0) + 1);
                    this.FLD3679.append(integer1);
                    hashMap1.put(s, integer1);
                    s = s + integer1;
                }
                hashMap0.put(s, "");
                for(int v2 = 0; v2 < xmlPullParser0.getAttributeCount(); ++v2) {
                    hashMap0.put(s + ".$" + xmlPullParser0.getAttributeName(v2), xmlPullParser0.getAttributeValue(v2));
                }
                v = v1;
                goto label_3;
            label_26:
                switch(v1) {
                    case 3: {
                        StringBuilder stringBuilder1 = this.FLD3679.delete(this.FLD3679.lastIndexOf("."), this.FLD3679.length());
                        this.FLD3679 = stringBuilder1;
                        if(stringBuilder1.length() == 0) {
                            return hashMap0;
                        }
                        v = v1;
                        goto label_3;
                    }
                    case 4: {
                        String s1 = xmlPullParser0.getText();
                        if(s1 != null) {
                            hashMap0.put(this.FLD3679.toString(), s1);
                        }
                        v = v1;
                        goto label_3;
                    }
                    default: {
                        v = v1;
                        goto label_3;
                    }
                }
            }
            catch(Throwable throwable1) {
            }
            try {
                CLS27.MTH893(throwable1);
                goto label_3;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return hashMap0;
            }
            v = v1;
            goto label_3;
        }
    }

    public static final ThreadLocal FLD3680;

    static {
        CLS392.FLD3680 = new ThreadLocal();
    }

    public static HashMap MTH5633(String s, String s1) {
        HashMap hashMap0 = new HashMap();
        int v = s == null ? -1 : s.indexOf("<" + s1);
        if(v < 0) {
            return hashMap0;
        }
        if(v > 0) {
            s = s.substring(v);
        }
        try {
            return new CLS391(s).MTH5631();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return hashMap0;
        }
    }
}

