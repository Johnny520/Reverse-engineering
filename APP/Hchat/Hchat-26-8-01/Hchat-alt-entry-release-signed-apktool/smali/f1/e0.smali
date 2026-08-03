.class public abstract Lf1/e0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lf1/w;->h:I

    .line 2
    .line 3
    sget-wide v0, Lf1/w;->b:J

    .line 4
    .line 5
    sput-wide v0, Lf1/e0;->a:J

    .line 6
    .line 7
    return-void
.end method

.method public static final a(Li0/h0;)Li1/b;
    .locals 3

    .line 1
    sget-object v0, Ly1/h1;->g:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lf1/z;

    .line 8
    .line 9
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Li0/l;->a:Li0/e;

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    new-instance v1, Lf1/a0;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lf1/a0;-><init>(Lf1/z;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    check-cast v1, Lf1/a0;

    .line 26
    .line 27
    iget-object p0, v1, Lf1/a0;->h:Li1/b;

    .line 28
    .line 29
    return-object p0
.end method
