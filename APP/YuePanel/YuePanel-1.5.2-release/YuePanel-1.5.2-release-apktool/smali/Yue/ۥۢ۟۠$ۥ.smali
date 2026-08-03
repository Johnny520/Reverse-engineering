.class public LYue/ۥۢ۟۠$ۥ;
.super LYue/ۥۢ۟۠;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۟۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e2\u06df\u06e0<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢ۟۠;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢ۟۠$ۥ;->ۥ۟۟۟۟(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢ۟۠$ۥ;->ۥ۟۟۟۠()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ۟۟۟(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۢ۟۠$ۥ;->ۥ۟۟۟ۡ(Ljava/util/List;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۟(Ljava/util/List;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06df\u06df\u06e6;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟۠()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(Ljava/util/List;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
