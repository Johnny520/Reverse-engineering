.class public final Lgq;
.super Lcom/youth/banner/adapter/BannerImageAdapter;
.source ""


# instance fields
.field public final synthetic a:Lcom/youth/banner/Banner;


# direct methods
.method public constructor <init>(Lcom/youth/banner/Banner;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lgq;->a:Lcom/youth/banner/Banner;

    invoke-direct {p0, p2}, Lcom/youth/banner/adapter/BannerImageAdapter;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final onBindView(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    check-cast p1, Lcom/youth/banner/holder/BannerImageHolder;

    check-cast p2, Ld1;

    const-wide p3, -0x2e0f6fffff835L

    invoke-static {p3, p4}, LGu;->r(J)Ljava/lang/String;

    const-wide p3, -0x2e0fdfffff835L

    invoke-static {p3, p4}, LGu;->r(J)Ljava/lang/String;

    iget-object p3, p0, Lgq;->a:Lcom/youth/banner/Banner;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lgw;

    move-result-object p3

    iget-object p2, p2, Ld1;->b:Ljava/lang/String;

    invoke-virtual {p3, p2}, Lgw;->n(Ljava/lang/String;)Law;

    move-result-object p2

    invoke-virtual {p2}, Ly5;->b()Ly5;

    move-result-object p2

    check-cast p2, Law;

    iget-object p1, p1, Lcom/youth/banner/holder/BannerImageHolder;->imageView:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Law;->A(Landroid/widget/ImageView;)V

    return-void
.end method
