.class public final Lg7/c;
.super Ld7/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final n:Ld7/f;

.field public final o:Ld7/e;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Ld7/j;-><init>(IZ)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld7/f;

    .line 7
    .line 8
    invoke-direct {v0}, Ld7/k;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lg7/c;->n:Ld7/f;

    .line 12
    .line 13
    new-instance v2, Ld7/e;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v3, v1}, Ld7/e;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lg7/c;->o:Ld7/e;

    .line 20
    .line 21
    new-instance v1, Ld7/b;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-direct {v1, v3, v4}, Ld7/b;-><init>(Lk7/f;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ld7/j;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sig="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lg7/c;->n:Ld7/f;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", certs="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lg7/c;->o:Ld7/e;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
