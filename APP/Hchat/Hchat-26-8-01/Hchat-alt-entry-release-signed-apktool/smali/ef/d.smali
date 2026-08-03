.class public final Lef/d;
.super Ldf/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Lmh/b;


# instance fields
.field public final b:Ldf/a;

.field public final c:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lef/d;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lef/d;->d:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ldf/a;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lef/d;->b:Ldf/a;

    .line 5
    .line 6
    iput-object p2, p0, Lef/d;->c:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method
