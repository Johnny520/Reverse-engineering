.class public final synthetic LYue/ۥ۟ۡۧ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۡۧ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "\u06e5"
.end annotation


# static fields
.field public static final synthetic ۥ:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, LYue/ۥۣۣ۟;->values()[LYue/ۥۣۣ۟;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sget-object v1, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v1, LYue/ۥۣۣ۟;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۟;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    sget-object v1, LYue/ۥۣۣ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1

    sput-object v0, LYue/ۥ۟ۡۧ۟$ۥ;->ۥ:[I

    return-void
.end method
