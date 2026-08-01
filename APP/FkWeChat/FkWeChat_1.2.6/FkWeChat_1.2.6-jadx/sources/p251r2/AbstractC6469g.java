package p251r2;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p251r2.C6464b;
import p350y1.C9516d;
import p365z1.AbstractC9832c;
import p365z1.C9830a;

/* JADX INFO: renamed from: r2.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6469g {
    /* JADX INFO: renamed from: a */
    public static final C6464b.a m25643a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i10) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C9830a c9830a = new C9830a(xmlResourceParser, 0, 2, null);
        C9516d.a aVarM38223a = AbstractC9832c.m38223a(c9830a, resources, theme, attributeSetAsAttributeSet);
        int iM38229g = 0;
        while (!AbstractC9832c.m38226d(xmlResourceParser)) {
            iM38229g = AbstractC9832c.m38229g(c9830a, resources, attributeSetAsAttributeSet, theme, aVarM38223a, iM38229g);
            xmlResourceParser.next();
        }
        return new C6464b.a(aVarM38223a.m37124f(), c9830a.m38175a() | i10);
    }
}
