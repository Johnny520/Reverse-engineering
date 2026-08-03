.class public LYue/ۥۣ۠ۨۦ$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# instance fields
.field public final ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۠ۨۦ$ۥ۟۟۟ۡ;->ۥ:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۠ۨۦ$ۥ۟۟۟ۡ;->ۥ۟:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣ۠ۨۦ$ۥ;)V
    .locals 0

    .line 4
    invoke-direct {p0}, LYue/ۥۣ۠ۨۦ$ۥ۟۟۟ۡ;-><init>()V

    return-void
.end method
