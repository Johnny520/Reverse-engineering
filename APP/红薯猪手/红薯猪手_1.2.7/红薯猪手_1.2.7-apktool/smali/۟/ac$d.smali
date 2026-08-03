.class public final L۟/ac$d;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/ac;-><init>(Landroid/content/Context;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "L\u06df/ac$b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/ac;


# direct methods
.method public constructor <init>(L۟/ac;)V
    .locals 0

    iput-object p1, p0, L۟/ac$d;->ۥ:L۟/ac;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, L۟/ac$b;

    .line 2
    .line 3
    iget-object v1, p0, L۟/ac$d;->ۥ:L۟/ac;

    .line 4
    .line 5
    iget-object v2, v1, L۟/ac;->ۥۡ۠:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, L۟/ac$b;-><init>(L۟/ac;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
