.class public final Lpe/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final e:Lmh/b;


# instance fields
.field public a:[Ljava/util/BitSet;

.field public b:[Ljava/util/BitSet;

.field public c:[Ljava/util/BitSet;

.field public d:[Ljava/util/BitSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lpe/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lpe/a;->e:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static a(II)[Ljava/util/BitSet;
    .locals 3

    .line 1
    new-array v0, p0, [Ljava/util/BitSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_0

    .line 5
    .line 6
    new-instance v2, Ljava/util/BitSet;

    .line 7
    .line 8
    invoke-direct {v2, p1}, Ljava/util/BitSet;-><init>(I)V

    .line 9
    .line 10
    .line 11
    aput-object v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0
.end method
