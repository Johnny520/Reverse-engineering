.class public final enum LEc;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum a:LEc;

.field public static final enum b:LEc;

.field public static final c:LEc;

.field public static final synthetic d:[LEc;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEc;

    const-string v1, "PREFER_ARGB_8888"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEc;->a:LEc;

    new-instance v1, LEc;

    const-string v2, "PREFER_RGB_565"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, LEc;->b:LEc;

    filled-new-array {v0, v1}, [LEc;

    move-result-object v1

    sput-object v1, LEc;->d:[LEc;

    sput-object v0, LEc;->c:LEc;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LEc;
    .locals 1

    const-class v0, LEc;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LEc;

    return-object p0
.end method

.method public static values()[LEc;
    .locals 1

    sget-object v0, LEc;->d:[LEc;

    invoke-virtual {v0}, [LEc;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LEc;

    return-object v0
.end method
