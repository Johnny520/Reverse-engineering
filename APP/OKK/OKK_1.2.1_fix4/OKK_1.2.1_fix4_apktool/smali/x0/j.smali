.class public final Lx0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lf0/P;

.field public b:Lf0/P;

.field public c:Lf0/P;

.field public d:Lf0/P;

.field public e:Lx0/c;

.field public f:Lx0/c;

.field public g:Lx0/c;

.field public h:Lx0/c;

.field public i:Lx0/e;

.field public j:Lx0/e;

.field public k:Lx0/e;

.field public l:Lx0/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx0/i;

    invoke-direct {v0}, Lx0/i;-><init>()V

    iput-object v0, p0, Lx0/j;->a:Lf0/P;

    new-instance v0, Lx0/i;

    invoke-direct {v0}, Lx0/i;-><init>()V

    iput-object v0, p0, Lx0/j;->b:Lf0/P;

    new-instance v0, Lx0/i;

    invoke-direct {v0}, Lx0/i;-><init>()V

    iput-object v0, p0, Lx0/j;->c:Lf0/P;

    new-instance v0, Lx0/i;

    invoke-direct {v0}, Lx0/i;-><init>()V

    iput-object v0, p0, Lx0/j;->d:Lf0/P;

    new-instance v0, Lx0/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/a;-><init>(F)V

    iput-object v0, p0, Lx0/j;->e:Lx0/c;

    new-instance v0, Lx0/a;

    invoke-direct {v0, v1}, Lx0/a;-><init>(F)V

    iput-object v0, p0, Lx0/j;->f:Lx0/c;

    new-instance v0, Lx0/a;

    invoke-direct {v0, v1}, Lx0/a;-><init>(F)V

    iput-object v0, p0, Lx0/j;->g:Lx0/c;

    new-instance v0, Lx0/a;

    invoke-direct {v0, v1}, Lx0/a;-><init>(F)V

    iput-object v0, p0, Lx0/j;->h:Lx0/c;

    new-instance v0, Lx0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/e;-><init>(I)V

    iput-object v0, p0, Lx0/j;->i:Lx0/e;

    new-instance v0, Lx0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/e;-><init>(I)V

    iput-object v0, p0, Lx0/j;->j:Lx0/e;

    new-instance v0, Lx0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/e;-><init>(I)V

    iput-object v0, p0, Lx0/j;->k:Lx0/e;

    new-instance v0, Lx0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx0/e;-><init>(I)V

    iput-object v0, p0, Lx0/j;->l:Lx0/e;

    return-void
.end method

.method public static b(Lf0/P;)V
    .locals 1

    instance-of v0, p0, Lx0/i;

    if-eqz v0, :cond_0

    check-cast p0, Lx0/i;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    instance-of v0, p0, Lx0/d;

    if-eqz v0, :cond_1

    check-cast p0, Lx0/d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lx0/k;
    .locals 2

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lx0/j;->a:Lf0/P;

    iput-object v1, v0, Lx0/k;->a:Lf0/P;

    iget-object v1, p0, Lx0/j;->b:Lf0/P;

    iput-object v1, v0, Lx0/k;->b:Lf0/P;

    iget-object v1, p0, Lx0/j;->c:Lf0/P;

    iput-object v1, v0, Lx0/k;->c:Lf0/P;

    iget-object v1, p0, Lx0/j;->d:Lf0/P;

    iput-object v1, v0, Lx0/k;->d:Lf0/P;

    iget-object v1, p0, Lx0/j;->e:Lx0/c;

    iput-object v1, v0, Lx0/k;->e:Lx0/c;

    iget-object v1, p0, Lx0/j;->f:Lx0/c;

    iput-object v1, v0, Lx0/k;->f:Lx0/c;

    iget-object v1, p0, Lx0/j;->g:Lx0/c;

    iput-object v1, v0, Lx0/k;->g:Lx0/c;

    iget-object v1, p0, Lx0/j;->h:Lx0/c;

    iput-object v1, v0, Lx0/k;->h:Lx0/c;

    iget-object v1, p0, Lx0/j;->i:Lx0/e;

    iput-object v1, v0, Lx0/k;->i:Lx0/e;

    iget-object v1, p0, Lx0/j;->j:Lx0/e;

    iput-object v1, v0, Lx0/k;->j:Lx0/e;

    iget-object v1, p0, Lx0/j;->k:Lx0/e;

    iput-object v1, v0, Lx0/k;->k:Lx0/e;

    iget-object v1, p0, Lx0/j;->l:Lx0/e;

    iput-object v1, v0, Lx0/k;->l:Lx0/e;

    return-object v0
.end method
