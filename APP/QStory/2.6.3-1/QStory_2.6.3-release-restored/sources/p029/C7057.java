package p029;

import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5039;
import java.util.Collections;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.InterfaceC5925;
import kotlin.sequences.AbstractC5954;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7057 extends AbstractC7176 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final AbstractC7176 f17507;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f17508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5925 f17509;

    public C7057(InterfaceC5925 interfaceC5925, Object obj, AbstractC7176 abstractC7176) {
        obj.getClass();
        abstractC7176.getClass();
        this.f17509 = interfaceC5925;
        this.f17508 = obj;
        this.f17507 = abstractC7176;
    }

    public final String toString() {
        List listM9342;
        List listM10669 = AbstractC5954.m10669(AbstractC5954.m10674(this, new C5039(25)));
        listM10669.getClass();
        if (listM10669.size() <= 1) {
            listM9342 = AbstractC5176.m9356(listM10669);
        } else {
            listM9342 = AbstractC5176.m9342(listM10669);
            Collections.reverse(listM9342);
        }
        return AbstractC5176.m9369(listM9342, null, "{", "}", new C5039(26), 25);
    }

    @Override // p050.AbstractC7176
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final Object mo12250(InterfaceC5925 interfaceC5925) {
        return interfaceC5925.equals(this.f17509) ? AbstractC3889.m7316(interfaceC5925).cast(this.f17508) : this.f17507.mo12250(interfaceC5925);
    }

    @Override // p050.AbstractC7176
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final AbstractC7176 mo12251(InterfaceC5925 interfaceC5925, Object obj) {
        InterfaceC5925 interfaceC59252 = this.f17509;
        boolean zEquals = interfaceC5925.equals(interfaceC59252);
        AbstractC7176 abstractC7176 = this.f17507;
        if (!zEquals) {
            AbstractC7176 abstractC7176Mo12251 = abstractC7176.mo12251(interfaceC5925, null);
            if (abstractC7176Mo12251 != abstractC7176) {
                this = new C7057(interfaceC59252, this.f17508, abstractC7176Mo12251);
            }
            abstractC7176 = this;
        }
        return obj != null ? new C7057(interfaceC5925, obj, abstractC7176) : abstractC7176;
    }
}
