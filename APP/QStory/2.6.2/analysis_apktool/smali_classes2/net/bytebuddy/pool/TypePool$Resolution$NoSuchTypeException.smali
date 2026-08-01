.class public Lnet/bytebuddy/pool/TypePool$Resolution$NoSuchTypeException;
.super Ljava/lang/IllegalStateException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Resolution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NoSuchTypeException"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "Cannot resolve type description for "

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Resolution$NoSuchTypeException;->name:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Resolution$NoSuchTypeException;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
