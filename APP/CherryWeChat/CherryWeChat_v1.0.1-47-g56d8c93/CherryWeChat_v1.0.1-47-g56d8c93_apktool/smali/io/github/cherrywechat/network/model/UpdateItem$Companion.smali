.class public final Lio/github/cherrywechat/network/model/UpdateItem$Companion;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/network/model/UpdateItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LOc;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lio/github/cherrywechat/network/model/UpdateItem$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final serializer()LQm;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LQm;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/network/model/UpdateItem$$serializer;->INSTANCE:Lio/github/cherrywechat/network/model/UpdateItem$$serializer;

    return-object v0
.end method
