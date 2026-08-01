package p046Z;

import java.sql.Timestamp;
import java.util.Date;
import p042W.AbstractC0334f;

/* JADX INFO: renamed from: Z.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0359b extends AbstractC0334f {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f840c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0359b(Class cls, int i2) {
        super(cls);
        this.f840c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p042W.AbstractC0334f
    /* JADX INFO: renamed from: a */
    public final Date mo562a(Date date) {
        switch (this.f840c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
