.class public final Ll3/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:La2/a;


# instance fields
.field public final a:Ll3/h;

.field public b:I

.field public final c:Ll3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La2/a;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll3/s;->d:La2/a;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ll3/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ll3/s;->b:I

    .line 6
    .line 7
    new-instance v0, Ll3/d;

    .line 8
    .line 9
    invoke-direct {v0}, Ll3/d;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ll3/s;->c:Ll3/d;

    .line 13
    .line 14
    iput-object p1, p0, Ll3/s;->a:Ll3/h;

    .line 15
    .line 16
    return-void
.end method
