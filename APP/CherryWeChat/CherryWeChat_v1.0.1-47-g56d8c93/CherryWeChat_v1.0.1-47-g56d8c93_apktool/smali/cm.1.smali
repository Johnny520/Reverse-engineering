.class public final enum Lcm;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum a:Lcm;

.field public static final enum b:Lcm;

.field public static final enum c:Lcm;

.field public static final enum d:Lcm;

.field public static final enum e:Lcm;

.field public static final enum f:Lcm;

.field public static final enum g:Lcm;

.field public static final enum h:Lcm;

.field public static final enum i:Lcm;

.field public static final enum j:Lcm;

.field public static final synthetic k:[Lcm;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcm;

    const-string v1, "VOID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcm;->a:Lcm;

    new-instance v1, Lcm;

    const-string v2, "INT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcm;->b:Lcm;

    new-instance v2, Lcm;

    const-string v3, "LONG"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcm;->c:Lcm;

    new-instance v3, Lcm;

    const-string v4, "FLOAT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcm;->d:Lcm;

    new-instance v4, Lcm;

    const-string v5, "DOUBLE"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcm;->e:Lcm;

    new-instance v5, Lcm;

    const-string v6, "BOOLEAN"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcm;->f:Lcm;

    new-instance v6, Lcm;

    const-string v7, "STRING"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lcm;->g:Lcm;

    new-instance v7, Lcm;

    sget-object v8, Ly6;->b:Lx6;

    const-string v8, "BYTE_STRING"

    const/4 v9, 0x7

    invoke-direct {v7, v8, v9}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcm;->h:Lcm;

    new-instance v8, Lcm;

    const-string v9, "ENUM"

    const/16 v10, 0x8

    invoke-direct {v8, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lcm;->i:Lcm;

    new-instance v9, Lcm;

    const-string v10, "MESSAGE"

    const/16 v11, 0x9

    invoke-direct {v9, v10, v11}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcm;->j:Lcm;

    filled-new-array/range {v0 .. v9}, [Lcm;

    move-result-object v0

    sput-object v0, Lcm;->k:[Lcm;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcm;
    .locals 1

    const-class v0, Lcm;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcm;

    return-object p0
.end method

.method public static values()[Lcm;
    .locals 1

    sget-object v0, Lcm;->k:[Lcm;

    invoke-virtual {v0}, [Lcm;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcm;

    return-object v0
.end method
