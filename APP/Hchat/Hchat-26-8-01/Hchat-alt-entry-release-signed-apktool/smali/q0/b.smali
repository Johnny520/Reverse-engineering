.class public final Lq0/b;
.super Ltf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/util/Collection;
.implements Lhg/a;


# static fields
.field public static final j:Lq0/b;


# instance fields
.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;

.field public final i:Lp0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lq0/b;

    .line 2
    .line 3
    sget-object v1, Lr0/b;->a:Lr0/b;

    .line 4
    .line 5
    sget-object v2, Lp0/b;->i:Lp0/b;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, Lq0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lp0/b;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lq0/b;->j:Lq0/b;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lp0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/b;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lq0/b;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lq0/b;->i:Lp0/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/b;->i:Lp0/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp0/b;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/b;->i:Lp0/b;

    .line 2
    .line 3
    iget v0, v0, Lp0/b;->h:I

    .line 4
    .line 5
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Lf/i0;

    .line 2
    .line 3
    iget-object v1, p0, Lq0/b;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lq0/b;->i:Lp0/b;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lf/i0;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
