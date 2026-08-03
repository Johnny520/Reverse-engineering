.class public final LQ2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final i:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Lsy;

.field public final b:Ljava/util/ArrayList;

.field public final c:LD2;

.field public final d:LN2;

.field public final e:LP3;

.field public f:Z

.field public g:F

.field public h:LP3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LQ2;->i:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(LP3;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lsy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsy;-><init>(I)V

    iput-object v0, p0, LQ2;->a:Lsy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LQ2;->b:Ljava/util/ArrayList;

    new-instance v0, LD2;

    const/4 v2, 0x5

    invoke-direct {v0, v2, p0}, LD2;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LQ2;->c:LD2;

    new-instance v0, LN2;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0}, LN2;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, LQ2;->d:LN2;

    iput-boolean v1, p0, LQ2;->f:Z

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LQ2;->g:F

    iput-object p1, p0, LQ2;->e:LP3;

    return-void
.end method
