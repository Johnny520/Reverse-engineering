.class public abstract Lr7/k;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final n:Lokio/a;

.field public static final o:Lokio/a;

.field public static final p:Lokio/a;


# instance fields
.field public m:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokio/a;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr7/k;->n:Lokio/a;

    .line 9
    .line 10
    new-instance v0, Lokio/a;

    .line 11
    .line 12
    const/16 v1, 0xa

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lr7/k;->o:Lokio/a;

    .line 18
    .line 19
    new-instance v0, Lokio/a;

    .line 20
    .line 21
    const/16 v1, 0x9

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lr7/k;->p:Lokio/a;

    .line 27
    .line 28
    return-void
.end method

.method public static R(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/high16 v0, -0x10000

    .line 5
    .line 6
    and-int/2addr v0, p0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {p0, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, "Value out of range [0 - 0xffff]: "

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public L()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr7/k;->P()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lr7/k;->m:I

    .line 6
    .line 7
    return-void
.end method

.method public N()I
    .locals 1

    .line 1
    iget v0, p0, Lk7/a;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public O()Z
    .locals 2

    .line 1
    iget v0, p0, Lr7/k;->m:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public abstract P()I
.end method

.method public Q(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract S(I)V
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lr7/k;->N()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lr7/k;->O()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    const-string v1, "NO_ENTRY"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget v1, p0, Lr7/k;->m:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    :goto_0
    const/16 v1, 0x29

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
