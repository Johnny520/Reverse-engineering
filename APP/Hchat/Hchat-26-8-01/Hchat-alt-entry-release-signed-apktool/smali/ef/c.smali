.class public final Lef/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public f:Lb5/k;

.field public g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lef/c;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lef/c;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lef/c;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lef/c;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lef/c;->e:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lef/c;
    .locals 7

    .line 1
    iget v0, p0, Lef/c;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "%s_res_0x%08x"

    .line 12
    .line 13
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    new-instance v1, Lef/c;

    .line 18
    .line 19
    iget-object v4, p0, Lef/c;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, Lef/c;->e:Ljava/lang/String;

    .line 22
    .line 23
    iget v2, p0, Lef/c;->a:I

    .line 24
    .line 25
    iget-object v3, p0, Lef/c;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct/range {v1 .. v6}, Lef/c;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lef/c;->f:Lb5/k;

    .line 31
    .line 32
    iput-object p1, v1, Lef/c;->f:Lb5/k;

    .line 33
    .line 34
    iget-object p1, p0, Lef/c;->g:Ljava/util/ArrayList;

    .line 35
    .line 36
    iput-object p1, v1, Lef/c;->g:Ljava/util/ArrayList;

    .line 37
    .line 38
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lef/c;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, " ("

    .line 8
    .line 9
    const-string v3, ")"

    .line 10
    .line 11
    const-string v4, "  0x"

    .line 12
    .line 13
    invoke-static {v0, v4, v1, v2, v3}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, " = "

    .line 18
    .line 19
    const-string v2, "."

    .line 20
    .line 21
    iget-object v3, p0, Lef/c;->e:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, p0, Lef/c;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lef/c;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
