.class public final LYue/ۥۣۢۥ$ۥ۟;
.super Ljava/lang/SecurityManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/SecurityManager;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣۢۥ$ۥ;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LYue/ۥۣۢۥ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public getClassContext()[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-super {p0}, Ljava/lang/SecurityManager;->getClassContext()[Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
