.class public abstract Ll4/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ll4/a;


# instance fields
.field public final a:Lv4/d0;

.field public final b:I

.field public final c:Lv4/z;

.field public final d:Lh4/u;


# direct methods
.method public constructor <init>(Lv4/d0;ILv4/z;Lh4/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Ll4/e;->a:Lv4/d0;

    .line 9
    .line 10
    iput p2, p0, Ll4/e;->b:I

    .line 11
    .line 12
    iput-object p3, p0, Ll4/e;->c:Lv4/z;

    .line 13
    .line 14
    iput-object p4, p0, Ll4/e;->d:Lh4/u;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p1, "attributes == null"

    .line 18
    .line 19
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1

    .line 24
    :cond_1
    const-string p1, "definingClass == null"

    .line 25
    .line 26
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1
.end method


# virtual methods
.method public final b()Lv4/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/e;->a:Lv4/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Ll4/e;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final d()Lv4/z;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/e;->c:Lv4/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lv4/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/e;->c:Lv4/z;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/z;->h:Lv4/c0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final getAttributes()Lh4/u;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/e;->d:Lh4/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Lv4/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Ll4/e;->c:Lv4/z;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/z;->g:Lv4/c0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x7b

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Ll4/e;->c:Lv4/z;

    .line 25
    .line 26
    invoke-virtual {v1}, Lv4/z;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x7d

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
