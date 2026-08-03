.class public final Lu6/d;
.super Lu6/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Ljava/lang/reflect/Member;

.field public final c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Member;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lu6/c;-><init>(Ljava/lang/reflect/Member;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lu6/d;->b:Ljava/lang/reflect/Member;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    iput-object p1, p0, Lu6/d;->c:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/reflect/Member;
    .locals 1

    .line 1
    iget-object v0, p0, Lu6/d;->b:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    return-object v0
.end method
