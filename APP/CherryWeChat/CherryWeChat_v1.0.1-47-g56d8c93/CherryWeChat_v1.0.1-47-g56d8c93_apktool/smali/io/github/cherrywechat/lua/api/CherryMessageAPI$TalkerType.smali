.class public final Lio/github/cherrywechat/lua/api/CherryMessageAPI$TalkerType;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/api/CherryMessageAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TalkerType"
.end annotation


# static fields
.field public static final ENTERPRISE:I = 0x3

.field public static final GROUP:I = 0x1

.field public static final INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI$TalkerType;

.field public static final OFFICIAL:I = 0x2

.field public static final PRIVATE:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI$TalkerType;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$TalkerType;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI$TalkerType;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI$TalkerType;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
