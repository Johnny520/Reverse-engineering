.class public final LPx;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:LTB;

.field public b:LTB;

.field public c:LTB;

.field public d:LTB;

.field public e:LXb;

.field public f:LXb;

.field public g:LXb;

.field public h:LXb;

.field public i:Lgf;

.field public j:Lgf;

.field public k:Lgf;

.field public l:Lgf;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LPx;->a:LTB;

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LPx;->b:LTB;

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LPx;->c:LTB;

    new-instance v0, LPw;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LPx;->d:LTB;

    new-instance v0, Lr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LPx;->e:LXb;

    new-instance v0, Lr;

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LPx;->f:LXb;

    new-instance v0, Lr;

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LPx;->g:LXb;

    new-instance v0, Lr;

    invoke-direct {v0, v1}, Lr;-><init>(F)V

    iput-object v0, p0, LPx;->h:LXb;

    new-instance v0, Lgf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LPx;->i:Lgf;

    new-instance v0, Lgf;

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LPx;->j:Lgf;

    new-instance v0, Lgf;

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LPx;->k:Lgf;

    new-instance v0, Lgf;

    invoke-direct {v0, v1}, Lgf;-><init>(I)V

    iput-object v0, p0, LPx;->l:Lgf;

    return-void
.end method


# virtual methods
.method public final a()LQx;
    .locals 2

    new-instance v0, LQx;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, LPx;->a:LTB;

    iput-object v1, v0, LQx;->a:LTB;

    iget-object v1, p0, LPx;->b:LTB;

    iput-object v1, v0, LQx;->b:LTB;

    iget-object v1, p0, LPx;->c:LTB;

    iput-object v1, v0, LQx;->c:LTB;

    iget-object v1, p0, LPx;->d:LTB;

    iput-object v1, v0, LQx;->d:LTB;

    iget-object v1, p0, LPx;->e:LXb;

    iput-object v1, v0, LQx;->e:LXb;

    iget-object v1, p0, LPx;->f:LXb;

    iput-object v1, v0, LQx;->f:LXb;

    iget-object v1, p0, LPx;->g:LXb;

    iput-object v1, v0, LQx;->g:LXb;

    iget-object v1, p0, LPx;->h:LXb;

    iput-object v1, v0, LQx;->h:LXb;

    iget-object v1, p0, LPx;->i:Lgf;

    iput-object v1, v0, LQx;->i:Lgf;

    iget-object v1, p0, LPx;->j:Lgf;

    iput-object v1, v0, LQx;->j:Lgf;

    iget-object v1, p0, LPx;->k:Lgf;

    iput-object v1, v0, LQx;->k:Lgf;

    iget-object v1, p0, LPx;->l:Lgf;

    iput-object v1, v0, LQx;->l:Lgf;

    return-object v0
.end method
