.class public final LYue/ۥۣۣ۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۣ۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۣۣ۟ۡ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۣ۟ۡ$ۥ;

    invoke-direct {v0}, LYue/ۥۣۣ۟ۡ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۣۣ۟ۡ$ۥ;->ۥ:LYue/ۥۣۣ۟ۡ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(I)I
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p1}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    move-result p1

    return p1
.end method
