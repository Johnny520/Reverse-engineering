.class public final Lm/m2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Lm/o2;


# direct methods
.method public constructor <init>(Lm/o2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/m2;->a:Lm/o2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(IJ)J
    .locals 3

    .line 1
    iget-object v0, p0, Lm/m2;->a:Lm/o2;

    .line 2
    .line 3
    iput p1, v0, Lm/o2;->j:I

    .line 4
    .line 5
    iget-object v1, v0, Lm/o2;->b:Lk/k1;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v2, v0, Lm/o2;->a:Lm/i2;

    .line 10
    .line 11
    invoke-interface {v2}, Lm/i2;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v0, Lm/o2;->a:Lm/i2;

    .line 18
    .line 19
    invoke-interface {v2}, Lm/i2;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    :cond_0
    iget p1, v0, Lm/o2;->j:I

    .line 26
    .line 27
    iget-object v0, v0, Lm/o2;->m:Lb0/d0;

    .line 28
    .line 29
    invoke-interface {v1, p2, p3, p1, v0}, Lk/k1;->b(JILb0/d0;)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :cond_1
    iget-object v1, v0, Lm/o2;->k:Lm/u1;

    .line 35
    .line 36
    invoke-virtual {v0, v1, p2, p3, p1}, Lm/o2;->c(Lm/u1;JI)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1
.end method
