.class public final LRj;
.super Landroid/content/ContextWrapper;
.source ""


# static fields
.field public static final k:Lzj;


# instance fields
.field public final a:Lzp;

.field public final b:LBb;

.field public final c:LPg;

.field public final d:LPg;

.field public final e:Ljava/util/List;

.field public final f:LM4;

.field public final g:Lcg;

.field public final h:LD2;

.field public final i:I

.field public j:Lmw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, LSs;->a:LPg;

    iput-object v1, v0, Lzj;->a:LPg;

    sput-object v0, LRj;->k:Lzj;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lzp;Lwy;LPg;LPg;LM4;Ljava/util/List;Lcg;LD2;)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, LRj;->a:Lzp;

    iput-object p4, p0, LRj;->c:LPg;

    iput-object p5, p0, LRj;->d:LPg;

    iput-object p7, p0, LRj;->e:Ljava/util/List;

    iput-object p6, p0, LRj;->f:LM4;

    iput-object p8, p0, LRj;->g:Lcg;

    iput-object p9, p0, LRj;->h:LD2;

    const/4 p1, 0x4

    iput p1, p0, LRj;->i:I

    new-instance p1, LBb;

    invoke-direct {p1, p3}, LBb;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LRj;->b:LBb;

    return-void
.end method


# virtual methods
.method public final a()LPv;
    .locals 1

    iget-object v0, p0, LRj;->b:LBb;

    invoke-virtual {v0}, LBb;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPv;

    return-object v0
.end method
