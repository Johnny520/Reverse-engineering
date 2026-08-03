.class public abstract Ly5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:I

.field public b:LVd;

.field public c:Lwu;

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:I

.field public i:LSm;

.field public j:Z

.field public k:Lvt;

.field public l:LA6;

.field public m:Ljava/lang/Class;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LVd;->e:LVd;

    iput-object v0, p0, Ly5;->b:LVd;

    sget-object v0, Lwu;->c:Lwu;

    iput-object v0, p0, Ly5;->c:Lwu;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly5;->f:Z

    const/4 v1, -0x1

    iput v1, p0, Ly5;->g:I

    iput v1, p0, Ly5;->h:I

    sget-object v1, LNf;->b:LNf;

    iput-object v1, p0, Ly5;->i:LSm;

    new-instance v1, Lvt;

    invoke-direct {v1}, Lvt;-><init>()V

    iput-object v1, p0, Ly5;->k:Lvt;

    new-instance v1, LA6;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lsy;-><init>(I)V

    iput-object v1, p0, Ly5;->l:LA6;

    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, Ly5;->m:Ljava/lang/Class;

    iput-boolean v0, p0, Ly5;->p:Z

    return-void
.end method

.method public static h(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Ly5;)Ly5;
    .locals 3

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1}, Ly5;->a(Ly5;)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p1, Ly5;->a:I

    iget v0, p1, Ly5;->a:I

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Ly5;->q:Z

    iput-boolean v0, p0, Ly5;->q:Z

    :cond_1
    iget v0, p1, Ly5;->a:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Ly5;->b:LVd;

    iput-object v0, p0, Ly5;->b:LVd;

    :cond_2
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Ly5;->c:Lwu;

    iput-object v0, p0, Ly5;->c:Lwu;

    :cond_3
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iput v1, p0, Ly5;->d:I

    iget v0, p0, Ly5;->a:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ly5;->a:I

    :cond_4
    iget v0, p1, Ly5;->a:I

    const/16 v2, 0x20

    invoke-static {v0, v2}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p1, Ly5;->d:I

    iput v0, p0, Ly5;->d:I

    iget v0, p0, Ly5;->a:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ly5;->a:I

    :cond_5
    iget v0, p1, Ly5;->a:I

    const/16 v2, 0x40

    invoke-static {v0, v2}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_6

    iput v1, p0, Ly5;->e:I

    iget v0, p0, Ly5;->a:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Ly5;->a:I

    :cond_6
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x80

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, p1, Ly5;->e:I

    iput v0, p0, Ly5;->e:I

    iget v0, p0, Ly5;->a:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Ly5;->a:I

    :cond_7
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x100

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-boolean v0, p1, Ly5;->f:Z

    iput-boolean v0, p0, Ly5;->f:Z

    :cond_8
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x200

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p1, Ly5;->h:I

    iput v0, p0, Ly5;->h:I

    iget v0, p1, Ly5;->g:I

    iput v0, p0, Ly5;->g:I

    :cond_9
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x400

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p1, Ly5;->i:LSm;

    iput-object v0, p0, Ly5;->i:LSm;

    :cond_a
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x1000

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p1, Ly5;->m:Ljava/lang/Class;

    iput-object v0, p0, Ly5;->m:Ljava/lang/Class;

    :cond_b
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x2000

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_c

    iget v0, p0, Ly5;->a:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Ly5;->a:I

    :cond_c
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x4000

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_d

    iget v0, p0, Ly5;->a:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Ly5;->a:I

    :cond_d
    iget v0, p1, Ly5;->a:I

    const/high16 v1, 0x20000

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-boolean v0, p1, Ly5;->j:Z

    iput-boolean v0, p0, Ly5;->j:Z

    :cond_e
    iget v0, p1, Ly5;->a:I

    const/16 v1, 0x800

    invoke-static {v0, v1}, Ly5;->h(II)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Ly5;->l:LA6;

    iget-object v1, p1, Ly5;->l:LA6;

    invoke-virtual {v0, v1}, LM4;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, Ly5;->p:Z

    iput-boolean v0, p0, Ly5;->p:Z

    :cond_f
    iget v0, p0, Ly5;->a:I

    iget v1, p1, Ly5;->a:I

    or-int/2addr v0, v1

    iput v0, p0, Ly5;->a:I

    iget-object v0, p0, Ly5;->k:Lvt;

    iget-object p1, p1, Ly5;->k:Lvt;

    iget-object v0, v0, Lvt;->b:LA6;

    iget-object p1, p1, Lvt;->b:LA6;

    invoke-virtual {v0, p1}, LA6;->g(LM4;)V

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final b()Ly5;
    .locals 2

    sget-object v0, Lre;->d:Lre;

    new-instance v1, Lb7;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0, v1}, Ly5;->r(Lre;LP5;)Ly5;

    move-result-object v0

    return-object v0
.end method

.method public c()Ly5;
    .locals 4

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly5;

    new-instance v1, Lvt;

    invoke-direct {v1}, Lvt;-><init>()V

    iput-object v1, v0, Ly5;->k:Lvt;

    iget-object v2, p0, Ly5;->k:Lvt;

    iget-object v1, v1, Lvt;->b:LA6;

    iget-object v2, v2, Lvt;->b:LA6;

    invoke-virtual {v1, v2}, LA6;->g(LM4;)V

    new-instance v1, LA6;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lsy;-><init>(I)V

    iput-object v1, v0, Ly5;->l:LA6;

    iget-object v3, p0, Ly5;->l:LA6;

    invoke-virtual {v1, v3}, LM4;->putAll(Ljava/util/Map;)V

    iput-boolean v2, v0, Ly5;->n:Z

    iput-boolean v2, v0, Ly5;->o:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/Class;)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1}, Ly5;->d(Ljava/lang/Class;)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Ly5;->m:Ljava/lang/Class;

    iget p1, p0, Ly5;->a:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final e(LVd;)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1}, Ly5;->e(LVd;)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Ly5;->b:LVd;

    iget p1, p0, Ly5;->a:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ly5;

    if-eqz v0, :cond_0

    check-cast p1, Ly5;

    invoke-virtual {p0, p1}, Ly5;->g(Ly5;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(I)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1}, Ly5;->f(I)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Ly5;->d:I

    iget p1, p0, Ly5;->a:I

    or-int/lit8 p1, p1, 0x20

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final g(Ly5;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Ly5;->d:I

    iget v1, p1, Ly5;->d:I

    if-ne v0, v1, :cond_0

    sget-object v0, LvD;->a:[C

    iget v0, p0, Ly5;->e:I

    iget v1, p1, Ly5;->e:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ly5;->f:Z

    iget-boolean v1, p1, Ly5;->f:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ly5;->g:I

    iget v1, p1, Ly5;->g:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ly5;->h:I

    iget v1, p1, Ly5;->h:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ly5;->j:Z

    iget-boolean v1, p1, Ly5;->j:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ly5;->b:LVd;

    iget-object v1, p1, Ly5;->b:LVd;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly5;->c:Lwu;

    iget-object v1, p1, Ly5;->c:Lwu;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ly5;->k:Lvt;

    iget-object v1, p1, Ly5;->k:Lvt;

    invoke-virtual {v0, v1}, Lvt;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly5;->l:LA6;

    iget-object v1, p1, Ly5;->l:LA6;

    invoke-virtual {v0, v1}, Lsy;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly5;->m:Ljava/lang/Class;

    iget-object v1, p1, Ly5;->m:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly5;->i:LSm;

    iget-object p1, p1, Ly5;->i:LSm;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 4

    sget-object v0, LvD;->a:[C

    const/16 v0, 0x11

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-static {v1, v0}, LvD;->g(II)I

    move-result v0

    iget v1, p0, Ly5;->d:I

    invoke-static {v1, v0}, LvD;->g(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget v2, p0, Ly5;->e:I

    invoke-static {v2, v0}, LvD;->g(II)I

    move-result v0

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0}, LvD;->g(II)I

    move-result v0

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-boolean v3, p0, Ly5;->f:Z

    invoke-static {v3, v0}, LvD;->g(II)I

    move-result v0

    iget v3, p0, Ly5;->g:I

    invoke-static {v3, v0}, LvD;->g(II)I

    move-result v0

    iget v3, p0, Ly5;->h:I

    invoke-static {v3, v0}, LvD;->g(II)I

    move-result v0

    iget-boolean v3, p0, Ly5;->j:Z

    invoke-static {v3, v0}, LvD;->g(II)I

    move-result v0

    const/4 v3, 0x1

    invoke-static {v3, v0}, LvD;->g(II)I

    move-result v0

    invoke-static {v2, v0}, LvD;->g(II)I

    move-result v0

    invoke-static {v2, v0}, LvD;->g(II)I

    move-result v0

    iget-object v2, p0, Ly5;->b:LVd;

    invoke-static {v0, v2}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Ly5;->c:Lwu;

    invoke-static {v0, v2}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Ly5;->k:Lvt;

    invoke-static {v0, v2}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Ly5;->l:LA6;

    invoke-static {v0, v2}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Ly5;->m:Ljava/lang/Class;

    invoke-static {v0, v2}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Ly5;->i:LSm;

    invoke-static {v0, v2}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    invoke-static {v0, v1}, LvD;->h(ILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i(Lre;LP5;)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ly5;->i(Lre;LP5;)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lre;->g:Lut;

    invoke-virtual {p0, v0, p1}, Ly5;->o(Lut;Lre;)Ly5;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Ly5;->s(LCB;Z)Ly5;

    move-result-object p1

    return-object p1
.end method

.method public final j(II)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ly5;->j(II)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Ly5;->h:I

    iput p2, p0, Ly5;->g:I

    iget p1, p0, Ly5;->a:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final k()Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0}, Ly5;->k()Ly5;

    move-result-object v0

    return-object v0

    :cond_0
    const v0, 0x5508010e

    iput v0, p0, Ly5;->e:I

    iget v0, p0, Ly5;->a:I

    or-int/lit16 v0, v0, 0x80

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final l()Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0}, Ly5;->l()Ly5;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lwu;->d:Lwu;

    iput-object v0, p0, Ly5;->c:Lwu;

    iget v0, p0, Ly5;->a:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final m(Lre;LP5;Z)Ly5;
    .locals 0

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2}, Ly5;->r(Lre;LP5;)Ly5;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Ly5;->i(Lre;LP5;)Ly5;

    move-result-object p1

    :goto_0
    const/4 p2, 0x1

    iput-boolean p2, p1, Ly5;->p:Z

    return-object p1
.end method

.method public final n()V
    .locals 2

    iget-boolean v0, p0, Ly5;->n:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o(Lut;Lre;)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ly5;->o(Lut;Lre;)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LQj;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Ly5;->k:Lvt;

    iget-object v0, v0, Lvt;->b:LA6;

    invoke-virtual {v0, p1, p2}, LA6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final p(Let;)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1}, Ly5;->p(Let;)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Ly5;->i:LSm;

    iget p1, p0, Ly5;->a:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final q()Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0}, Ly5;->q()Ly5;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Ly5;->f:Z

    iget v0, p0, Ly5;->a:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final r(Lre;LP5;)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ly5;->r(Lre;LP5;)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lre;->g:Lut;

    invoke-virtual {p0, v0, p1}, Ly5;->o(Lut;Lre;)Ly5;

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p1}, Ly5;->s(LCB;Z)Ly5;

    move-result-object p1

    return-object p1
.end method

.method public final s(LCB;Z)Ly5;
    .locals 2

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ly5;->s(LCB;Z)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lxe;

    invoke-direct {v0, p1, p2}, Lxe;-><init>(LCB;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, Ly5;->t(Ljava/lang/Class;LCB;Z)Ly5;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, Ly5;->t(Ljava/lang/Class;LCB;Z)Ly5;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0, v1, v0, p2}, Ly5;->t(Ljava/lang/Class;LCB;Z)Ly5;

    new-instance v0, LCj;

    invoke-direct {v0, p1}, LCj;-><init>(LCB;)V

    const-class p1, LAj;

    invoke-virtual {p0, p1, v0, p2}, Ly5;->t(Ljava/lang/Class;LCB;Z)Ly5;

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final t(Ljava/lang/Class;LCB;Z)Ly5;
    .locals 1

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ly5;->t(Ljava/lang/Class;LCB;Z)Ly5;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2}, LQj;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Ly5;->l:LA6;

    invoke-virtual {v0, p1, p2}, LA6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Ly5;->a:I

    const p2, 0x10800

    or-int/2addr p2, p1

    iput p2, p0, Ly5;->a:I

    const/4 p2, 0x0

    iput-boolean p2, p0, Ly5;->p:Z

    if-eqz p3, :cond_1

    const p2, 0x30800

    or-int/2addr p1, p2

    iput p1, p0, Ly5;->a:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly5;->j:Z

    :cond_1
    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method

.method public final u()Ly5;
    .locals 2

    iget-boolean v0, p0, Ly5;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly5;->c()Ly5;

    move-result-object v0

    invoke-virtual {v0}, Ly5;->u()Ly5;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ly5;->q:Z

    iget v0, p0, Ly5;->a:I

    const/high16 v1, 0x100000

    or-int/2addr v0, v1

    iput v0, p0, Ly5;->a:I

    invoke-virtual {p0}, Ly5;->n()V

    return-object p0
.end method
