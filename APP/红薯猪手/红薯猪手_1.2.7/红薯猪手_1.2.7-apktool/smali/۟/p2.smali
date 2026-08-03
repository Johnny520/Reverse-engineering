.class public final L۟/p2;
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


# direct methods
.method public constructor <init>(L۟/h2;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, L۟/p2;->ۥ:L۟/h2;

    iput-object p2, p0, L۟/p2;->ۥ۟:Landroid/app/Activity;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, L۟/p2;->ۥ:L۟/h2;

    .line 2
    .line 3
    iget-object v1, p0, L۟/p2;->ۥ۟:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, L۟/h2;->ۥ۟ۢ(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    .line 12
    .line 13
    return-object v0
.end method
