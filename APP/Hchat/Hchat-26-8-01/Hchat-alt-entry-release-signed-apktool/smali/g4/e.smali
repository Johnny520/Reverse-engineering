.class public final Lg4/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lg4/j;

.field public b:Z

.field public c:I

.field public d:Lg4/j;

.field public e:Ljava/lang/String;

.field public f:Lg4/k;

.field public g:Lr4/k;

.field public final h:Ljava/util/LinkedHashMap;

.field public final i:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lg4/j;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg4/e;->h:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lg4/e;->i:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    iput-object p1, p0, Lg4/e;->a:Lg4/j;

    .line 19
    .line 20
    return-void
.end method
