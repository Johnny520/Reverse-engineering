.class public final L۟/n2;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/p1;

.field public final synthetic ۥ۟:L۟/f3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/f3<",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L۟/p1;L۟/i2;)V
    .locals 0

    iput-object p1, p0, L۟/n2;->ۥ:L۟/p1;

    iput-object p2, p0, L۟/n2;->ۥ۟:L۟/f3;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, L۟/n2;->ۥ:L۟/p1;

    .line 2
    .line 3
    iget-object v0, v0, L۟/p1;->ۥۣ۟:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, L۟/ta;->ۥ۠ۦ(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    xor-int/2addr v0, v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    sget v0, L۟/o;->ۥ:I

    .line 20
    .line 21
    iget-object v0, p0, L۟/n2;->ۥ:L۟/p1;

    .line 22
    .line 23
    iget-object v0, v0, L۟/p1;->ۥۣ۟:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, L۟/o;->ۥ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, L۟/n2;->ۥ:L۟/p1;

    .line 32
    .line 33
    iget-object v0, v0, L۟/p1;->ۥ۟۠:Ljava/lang/Boolean;

    .line 34
    .line 35
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-static {v0, v1}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    sget v0, L۟/o;->ۥ:I

    .line 44
    .line 45
    invoke-static {}, L۟/o;->ۥۣ۟()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    iget-object v0, p0, L۟/n2;->ۥ۟:L۟/f3;

    .line 50
    .line 51
    invoke-interface {v0}, L۟/f3;->ۥ()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :goto_1
    return-object v1
.end method
