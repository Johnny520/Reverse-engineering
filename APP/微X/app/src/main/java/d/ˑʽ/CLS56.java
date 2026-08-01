// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.יʻ.CLS69;
import java.io.StringReader;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class CLS56 {
    public static final class CLS55 {
        public final HashMap FLD284;
        public final HashMap FLD285;
        public StringBuilder FLD286;
        public final XmlPullParser FLD287;

        public CLS55(String s) {
            this.FLD286 = new StringBuilder();
            try {
                ThreadLocal threadLocal0 = CLS56.FLD288;
                XmlPullParser xmlPullParser0 = (XmlPullParser)threadLocal0.get();
                this.FLD287 = xmlPullParser0;
                if(xmlPullParser0 == null) {
                    XmlPullParser xmlPullParser1 = XmlPullParserFactory.newInstance().newPullParser();
                    this.FLD287 = xmlPullParser1;
                    threadLocal0.set(xmlPullParser1);
                }
                StringReader stringReader0 = new StringReader(s);
                this.FLD287.setInput(stringReader0);
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
            this.FLD284 = new HashMap();
            this.FLD285 = new HashMap();
        }

        public final HashMap MTH720() {
            int v1;
            int v;
            XmlPullParser xmlPullParser0;
            HashMap hashMap0;
            try {
                hashMap0 = this.FLD285;
                xmlPullParser0 = this.FLD287;
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
                CLS69.MTH797(throwable0);
                return hashMap0;
            }
            try {
                StringBuilder stringBuilder0 = this.FLD286;
                stringBuilder0.append('.');
                stringBuilder0.append(xmlPullParser0.getName());
                String s = this.FLD286.toString();
                HashMap hashMap1 = this.FLD284;
                Integer integer0 = (Integer)hashMap1.get(s);
                if(integer0 == null) {
                    hashMap1.put(s, 0);
                }
                else {
                    Integer integer1 = (int)(((int)integer0) + 1);
                    this.FLD286.append(integer1);
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
                        StringBuilder stringBuilder1 = this.FLD286.delete(this.FLD286.lastIndexOf("."), this.FLD286.length());
                        this.FLD286 = stringBuilder1;
                        if(stringBuilder1.length() == 0) {
                            return hashMap0;
                        }
                        v = v1;
                        goto label_3;
                    }
                    case 4: {
                        String s1 = xmlPullParser0.getText();
                        if(s1 != null) {
                            hashMap0.put(this.FLD286.toString(), s1);
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
                CLS69.MTH797(throwable1);
                goto label_3;
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
                return hashMap0;
            }
            v = v1;
            goto label_3;
        }
    }

    public static final ThreadLocal FLD288;

    static {
        CLS56.FLD288 = new ThreadLocal();
    }
}

