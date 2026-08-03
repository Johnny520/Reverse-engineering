.class public final L۟/i2;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/h2;

.field public final synthetic ۥ۟:Landroid/app/Activity;

.field public final synthetic ۥ۟۟:L۟/o5;


# direct methods
.method public constructor <init>(Landroid/app/Activity;L۟/o5;L۟/h2;)V
    .locals 0

    iput-object p3, p0, L۟/i2;->ۥ:L۟/h2;

    iput-object p1, p0, L۟/i2;->ۥ۟:Landroid/app/Activity;

    iput-object p2, p0, L۟/i2;->ۥ۟۟:L۟/o5;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, L۟/i2;->ۥ:L۟/h2;

    .line 2
    .line 3
    iget-object v1, p0, L۟/i2;->ۥ۟:Landroid/app/Activity;

    .line 4
    .line 5
    iget-object v2, p0, L۟/i2;->ۥ۟۟:L۟/o5;

    .line 6
    .line 7
    iget-object v2, v2, L۟/o5;->ۥ۟ۢ:L۟/wb;

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, L۟/h2;->ۥ۟ۡ(L۟/h2;Landroid/app/Activity;L۟/wb;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    .line 13
    .line 14
    return-object v0
.end method
