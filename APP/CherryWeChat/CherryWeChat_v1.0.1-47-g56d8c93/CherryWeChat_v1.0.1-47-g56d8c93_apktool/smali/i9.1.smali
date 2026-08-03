.class public final Li9;
.super Lhm;
.source ""

# interfaces
.implements Lh9;


# instance fields
.field public final e:Lkm;


# direct methods
.method public constructor <init>(Lkm;)V
    .locals 0

    invoke-direct {p0}, Lcp;-><init>()V

    iput-object p1, p0, Li9;->e:Lkm;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lhm;->d:Lkm;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lkm;->n(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lhm;->d:Lkm;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Li9;->e:Lkm;

    invoke-virtual {v0, p1}, Lkm;->h(Ljava/lang/Object;)Z

    return-void
.end method
