.class public final enum La/s4$a$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/s4$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/s4$a$a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:La/s4$a$a$a;

.field public static final enum b:La/s4$a$a$a;

.field public static final enum c:La/s4$a$a$a;

.field public static final synthetic d:[La/s4$a$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, La/s4$a$a$a;

    const-string v1, "HIDDEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, La/s4$a$a$a;->a:La/s4$a$a$a;

    new-instance v1, La/s4$a$a$a;

    const-string v2, "UNHIDDEN_USER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, La/s4$a$a$a;->b:La/s4$a$a$a;

    new-instance v2, La/s4$a$a$a;

    const-string v3, "UNHIDDEN_COMMAND"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, La/s4$a$a$a;->c:La/s4$a$a$a;

    filled-new-array {v0, v1, v2}, [La/s4$a$a$a;

    move-result-object v0

    sput-object v0, La/s4$a$a$a;->d:[La/s4$a$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static valueOf(Ljava/lang/String;)La/s4$a$a$a;
    .locals 1

    const-class v0, La/s4$a$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La/s4$a$a$a;

    return-object p0
.end method

.method public static values()[La/s4$a$a$a;
    .locals 1

    sget-object v0, La/s4$a$a$a;->d:[La/s4$a$a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/s4$a$a$a;

    return-object v0
.end method
