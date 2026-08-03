.class public final Lqg/k;
.super Lqg/u0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqg/j;


# instance fields
.field public final k:Lqg/y0;


# direct methods
.method public constructor <init>(Lqg/y0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvg/i;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqg/k;->k:Lqg/y0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqg/u0;->j()Lqg/y0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lqg/y0;->B(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lqg/k;->k:Lqg/y0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqg/u0;->j()Lqg/y0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lqg/y0;->v(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
