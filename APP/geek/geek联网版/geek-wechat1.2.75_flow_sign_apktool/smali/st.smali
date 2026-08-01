.class public final Lst;
.super Ljava/lang/Object;


# static fields
.field public static final e:Le;


# instance fields
.field public final a:Lee;

.field public final b:Lee;

.field public final c:Lee;

.field public final d:Lee;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le;-><init>(F)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lst;->e:Le;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lee;Lee;Lee;Lee;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lst;->a:Lee;

    .line 5
    .line 6
    iput-object p3, p0, Lst;->b:Lee;

    .line 7
    .line 8
    iput-object p4, p0, Lst;->c:Lee;

    .line 9
    .line 10
    iput-object p2, p0, Lst;->d:Lee;

    .line 11
    .line 12
    return-void
.end method
