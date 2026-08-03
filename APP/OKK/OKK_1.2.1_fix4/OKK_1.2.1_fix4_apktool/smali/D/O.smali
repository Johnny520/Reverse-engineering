.class public final LD/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# instance fields
.field public final a:LD/r;


# direct methods
.method public constructor <init>(LD/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/O;->a:LD/r;

    return-void
.end method


# virtual methods
.method public final onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    new-instance v0, LD/h;

    new-instance v1, LD/d;

    invoke-direct {v1, p2}, LD/d;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, LD/h;-><init>(LD/g;)V

    iget-object v1, p0, LD/O;->a:LD/r;

    check-cast v1, LJ/s;

    invoke-virtual {v1, p1, v0}, LJ/s;->a(Landroid/view/View;LD/h;)LD/h;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    iget-object p1, p1, LD/h;->a:LD/g;

    invoke-interface {p1}, LD/g;->t()Landroid/view/ContentInfo;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, LD/c;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
