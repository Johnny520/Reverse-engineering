package yyds;

import com.thegrizzlylabs.sardineandroid.model.Prop;
import com.thegrizzlylabs.sardineandroid.model.Property;
import com.thegrizzlylabs.sardineandroid.model.Resourcetype;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.xml.parsers.DocumentBuilderFactory;
import org.simpleframework.xml.convert.Registry;
import org.simpleframework.xml.convert.RegistryStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: yyds.ᲇᲀᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2515 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final String[] f12415;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final DocumentBuilderFactory f12416 = DocumentBuilderFactory.newInstance();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final List f12417;

    static {
        String[] strArr = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "EEE MMM dd HH:mm:ss zzz yyyy", "EEEEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMMM d HH:mm:ss yyyy"};
        f12415 = strArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < f12415.length; i++) {
            arrayList.add(new ThreadLocal());
        }
        f12417 = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Persister m4559() {
        Format format = new Format("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        Registry registry = new Registry();
        Persister persister = new Persister(new RegistryStrategy(registry), format);
        registry.bind(Prop.class, new C1906(persister, Prop.class));
        registry.bind(Resourcetype.class, new C1906(persister, Resourcetype.class));
        registry.bind(Property.class, Property.PropertyConverter.class);
        return persister;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Date m4560(String str) {
        Date date = null;
        if (str == null) {
            return null;
        }
        int i = 0;
        while (true) {
            List list = f12417;
            if (i >= list.size()) {
                break;
            }
            ThreadLocal threadLocal = (ThreadLocal) list.get(i);
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) threadLocal.get();
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(f12415[i], Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                threadLocal.set(simpleDateFormat);
            }
            try {
                continue;
                date = simpleDateFormat.parse(str);
                break;
            } catch (ParseException unused) {
                i++;
            }
        }
        return date;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C0356 m4561(Element element) {
        return element.getNamespaceURI() == null ? new C0356("DAV:", element.getLocalName(), "D") : element.getPrefix() == null ? new C0356(element.getNamespaceURI(), element.getLocalName(), "") : new C0356(element.getNamespaceURI(), element.getLocalName(), element.getPrefix());
    }
}
