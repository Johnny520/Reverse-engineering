.class public final L۟/d0$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/d0;->ۥۣ۟()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/n1;

.field public final synthetic ۥ۟:L۟/d0;


# direct methods
.method public constructor <init>(L۟/n1;L۟/d0;)V
    .locals 0

    iput-object p1, p0, L۟/d0$a;->ۥ:L۟/n1;

    iput-object p2, p0, L۟/d0$a;->ۥ۟:L۟/d0;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, L۟/d0$a;->ۥ:L۟/n1;

    .line 7
    .line 8
    iget-object v1, v1, L۟/n1;->ۥ:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, L۟/p0;

    .line 25
    .line 26
    iget-object v3, v2, L۟/p0;->ۥ۟ۧ:Ljava/lang/Boolean;

    .line 27
    .line 28
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-static {v3, v4}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    iget-object v2, v2, L۟/p0;->ۥ۟:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object v1, L۟/d1;->ۥ:L۟/kb;

    .line 43
    .line 44
    invoke-static {}, L۟/d1$b;->ۥ()L۟/x3;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, p0, L۟/d0$a;->ۥ۟:L۟/d0;

    .line 49
    .line 50
    iget-object v2, v2, L۟/d0;->ۥ۠ۤ:L۟/p0;

    .line 51
    .line 52
    iget-object v2, v2, L۟/p0;->ۥ۟:Ljava/lang/String;

    .line 53
    .line 54
    invoke-interface {v1, v2, v0}, L۟/x3;->ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    .line 58
    .line 59
    return-object v0
.end method
