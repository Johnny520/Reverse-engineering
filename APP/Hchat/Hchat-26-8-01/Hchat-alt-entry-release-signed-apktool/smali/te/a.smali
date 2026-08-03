.class public final Lte/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lmh/b;


# instance fields
.field public final a:Lbc/k;

.field public final b:Ljava/util/HashSet;

.field public final c:Ljava/util/TreeSet;

.field public final d:Ljava/util/TreeSet;

.field public final e:Ljava/util/TreeMap;

.field public final f:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lte/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lte/a;->g:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lbc/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/TreeSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lte/a;->c:Ljava/util/TreeSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/TreeSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lte/a;->d:Ljava/util/TreeSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/TreeMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lte/a;->e:Ljava/util/TreeMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lte/a;->f:Ljava/util/ArrayList;

    .line 31
    .line 32
    iput-object p1, p0, Lte/a;->a:Lbc/k;

    .line 33
    .line 34
    iget-object p1, p1, Lbc/k;->g:Lbc/g;

    .line 35
    .line 36
    iget-object p1, p1, Lbc/g;->N:Ljava/util/HashSet;

    .line 37
    .line 38
    iput-object p1, p0, Lte/a;->b:Ljava/util/HashSet;

    .line 39
    .line 40
    return-void
.end method
