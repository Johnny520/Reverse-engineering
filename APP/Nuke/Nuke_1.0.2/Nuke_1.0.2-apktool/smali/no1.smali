.class public final Lno1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lno1$a;,
        Lno1$b;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lno1$b;


# instance fields
.field private final author:Ljava/lang/String;

.field private final id:I

.field private final isAlwaysShow:Z

.field private final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lno1$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lno1$b;-><init>(Lc50;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lno1;->Companion:Lno1$b;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IZLdp2;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p1, 0xf

    .line 2
    .line 3
    const/16 v0, 0xf

    .line 4
    .line 5
    if-ne v0, p6, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lno1;->message:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lno1;->author:Ljava/lang/String;

    .line 13
    .line 14
    iput p4, p0, Lno1;->id:I

    .line 15
    .line 16
    iput-boolean p5, p0, Lno1;->isAlwaysShow:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, Lno1$a;->INSTANCE:Lno1$a;

    .line 20
    .line 21
    invoke-virtual {p0}, Lno1$a;->e()Lyo2;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1, v0, p0}, Leu;->b0(IILyo2;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lno1;->message:Ljava/lang/String;

    iput-object p2, p0, Lno1;->author:Ljava/lang/String;

    iput p3, p0, Lno1;->id:I

    iput-boolean p4, p0, Lno1;->isAlwaysShow:Z

    return-void
.end method

.method public static synthetic f(Lno1;Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Lno1;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lno1;->message:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lno1;->author:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lno1;->id:I

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget-boolean p4, p0, Lno1;->isAlwaysShow:Z

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lno1;->e(Ljava/lang/String;Ljava/lang/String;IZ)Lno1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static final synthetic k(Lno1;Lwx;Lyo2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lno1;->message:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Ldv2;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, p2, v1, v0}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iget-object v1, p0, Lno1;->author:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0, v1}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    iget v1, p0, Lno1;->id:I

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1, p2}, Ldv2;->u(IILyo2;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    iget-boolean p0, p0, Lno1;->isAlwaysShow:Z

    .line 23
    .line 24
    invoke-virtual {p1, p2, v0, p0}, Ldv2;->r(Lyo2;IZ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lno1;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lno1;->author:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, Lno1;->id:I

    .line 2
    .line 3
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lno1;->isAlwaysShow:Z

    .line 2
    .line 3
    return p0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;IZ)Lno1;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lno1;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2, p3, p4}, Lno1;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lno1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lno1;

    .line 12
    .line 13
    iget-object v1, p0, Lno1;->message:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lno1;->message:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lno1;->author:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lno1;->author:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lno1;->id:I

    .line 36
    .line 37
    iget v3, p1, Lno1;->id:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-boolean p0, p0, Lno1;->isAlwaysShow:Z

    .line 43
    .line 44
    iget-boolean p1, p1, Lno1;->isAlwaysShow:Z

    .line 45
    .line 46
    if-eq p0, p1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lno1;->author:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()I
    .locals 0

    .line 1
    iget p0, p0, Lno1;->id:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lno1;->message:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lno1;->author:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lhk1;->f(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lno1;->id:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lvi0;->d(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean p0, p0, Lno1;->isAlwaysShow:Z

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lno1;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lno1;->isAlwaysShow:Z

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lno1;->message:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lno1;->author:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lno1;->id:I

    .line 6
    .line 7
    iget-boolean p0, p0, Lno1;->isAlwaysShow:Z

    .line 8
    .line 9
    const-string v3, ", author="

    .line 10
    .line 11
    const-string v4, ", id="

    .line 12
    .line 13
    const-string v5, "Notice(message="

    .line 14
    .line 15
    invoke-static {v5, v0, v3, v1, v4}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", isAlwaysShow="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ")"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
