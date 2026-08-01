.class public final Lp2;
.super Ljava/lang/Object;


# static fields
.field public static final f:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Lb40;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ll0;

.field public d:Lr5;

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp2;->f:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb40;

    .line 5
    .line 6
    invoke-direct {v0}, Lb40;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp2;->a:Lb40;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lp2;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ll0;

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-direct {v0, v1, p0}, Ll0;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lp2;->c:Ll0;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lp2;->e:Z

    .line 28
    .line 29
    return-void
.end method
