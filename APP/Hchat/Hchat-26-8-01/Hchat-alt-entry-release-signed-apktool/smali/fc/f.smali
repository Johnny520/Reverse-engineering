.class public Lfc/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:Lmh/b;


# instance fields
.field public a:Ljava/lang/StringBuilder;

.field public b:Ljava/lang/String;

.field public c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lfc/f;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lfc/f;->f:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lfc/f;->b:Ljava/lang/String;

    const/4 v0, 0x0

    .line 33
    iput v0, p0, Lfc/f;->c:I

    .line 34
    const-string v0, "    "

    iput-object v0, p0, Lfc/f;->d:Ljava/lang/String;

    .line 35
    sget-object v0, Lbc/g;->Z:Ljava/lang/String;

    iput-object v0, p0, Lfc/f;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lbc/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v0, ""

    .line 12
    .line 13
    iput-object v0, p0, Lfc/f;->b:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lfc/f;->c:I

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, Lbc/g;->G:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v0, p0, Lfc/f;->d:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p1, p1, Lbc/g;->F:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p1, p0, Lfc/f;->e:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public a(C)Lfc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lfc/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(Lfc/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object p1, p1, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public bridge d(C)Lfc/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfc/f;->a(C)Lfc/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge e(Ljava/lang/String;)Lfc/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfc/f;->b(Ljava/lang/String;)Lfc/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lfc/f;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lfc/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Ljava/lang/String;)Lfc/f;
    .locals 4

    .line 1
    iget-object v0, p0, Lfc/f;->e:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lfc/f;->b:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public bridge i(Ljava/lang/String;)Lfc/f;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lfc/f;->h(Ljava/lang/String;)Lfc/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public j(Lhc/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public k(Lhc/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Lic/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget v0, p0, Lfc/f;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lfc/f;->c:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lfc/f;->f:Lmh/b;

    .line 10
    .line 11
    const-string v1, "Indent < 0"

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lmh/b;->v(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lfc/f;->c:I

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lfc/f;->t()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget v0, p0, Lfc/f;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lfc/f;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lfc/f;->t()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lfc/f;->f()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfc/f;->g()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x7d

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lfc/f;->a(C)Lfc/f;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final r(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lfc/f;->b(Ljava/lang/String;)Lfc/f;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final s(I)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lfc/f;->p()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lfc/f;->m(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final t()V
    .locals 4

    .line 1
    iget v0, p0, Lfc/f;->c:I

    .line 2
    .line 3
    sget-object v1, Lxe/s;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v2, p0, Lfc/f;->d:Ljava/lang/String;

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    move-object v0, v2

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    mul-int/2addr v3, v0

    .line 24
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_1
    iput-object v0, p0, Lfc/f;->b:Ljava/lang/String;

    .line 41
    .line 42
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
