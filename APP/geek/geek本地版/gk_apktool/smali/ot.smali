.class public final Lot;
.super Ljava/lang/Object;


# static fields
.field public static final e:Le;


# instance fields
.field public final a:Lde;

.field public final b:Lde;

.field public final c:Lde;

.field public final d:Lde;


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
    sput-object v0, Lot;->e:Le;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lde;Lde;Lde;Lde;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lot;->a:Lde;

    .line 5
    .line 6
    iput-object p3, p0, Lot;->b:Lde;

    .line 7
    .line 8
    iput-object p4, p0, Lot;->c:Lde;

    .line 9
    .line 10
    iput-object p2, p0, Lot;->d:Lde;

    .line 11
    .line 12
    return-void
.end method
