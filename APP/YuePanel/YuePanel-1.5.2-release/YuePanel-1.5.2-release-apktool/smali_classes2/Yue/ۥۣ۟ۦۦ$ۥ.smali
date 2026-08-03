.class public LYue/ۥۣ۟ۦۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.2"
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۦۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۣ۟ۦۦ$ۥ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣ۟ۦۦ$ۥ;

    invoke-direct {v0}, LYue/ۥۣ۟ۦۦ$ۥ;-><init>()V

    sput-object v0, LYue/ۥۣ۟ۦۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۦ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ()LYue/ۥۣ۟ۦۦ$ۥ;
    .locals 1

    sget-object v0, LYue/ۥۣ۟ۦۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۦ$ۥ;

    return-object v0
.end method


# virtual methods
.method public final ۥ۟()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    sget-object v0, LYue/ۥۣ۟ۦۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟ۦۦ$ۥ;

    return-object v0
.end method
