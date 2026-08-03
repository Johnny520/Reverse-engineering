.class public final L۟/t1$b;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/h3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/t1;->ۥ۟۠(L۟/p8;Ljava/util/List;L۟/p8;Ljava/lang/String;L۟/q8;Landroid/app/AlertDialog;Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/h3<",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:Landroid/widget/TextView;

.field public final synthetic ۥ۟۟:L۟/p8;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/widget/TextView;L۟/p8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/TextView;",
            "L\u06df/p8;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, L۟/t1$b;->ۥ:Ljava/util/List;

    iput-object p2, p0, L۟/t1$b;->ۥ۟:Landroid/widget/TextView;

    iput-object p3, p0, L۟/t1$b;->ۥ۟۟:L۟/p8;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    long-to-float v0, v0

    .line 14
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    mul-float/2addr v0, v1

    .line 17
    long-to-float p1, p1

    .line 18
    div-float/2addr v0, p1

    .line 19
    const/16 p1, 0x64

    .line 20
    .line 21
    int-to-float p1, p1

    .line 22
    mul-float/2addr v0, p1

    .line 23
    float-to-int p1, v0

    .line 24
    new-instance p2, L۟/u1;

    .line 25
    .line 26
    iget-object v0, p0, L۟/t1$b;->ۥ:Ljava/util/List;

    .line 27
    .line 28
    iget-object v1, p0, L۟/t1$b;->ۥ۟:Landroid/widget/TextView;

    .line 29
    .line 30
    iget-object v2, p0, L۟/t1$b;->ۥ۟۟:L۟/p8;

    .line 31
    .line 32
    invoke-direct {p2, v0, v1, p1, v2}, L۟/u1;-><init>(Ljava/util/List;Landroid/widget/TextView;IL۟/p8;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2}, L۟/l3;->ۥۣ۟(L۟/g3;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 39
    .line 40
    return-object p1
.end method
