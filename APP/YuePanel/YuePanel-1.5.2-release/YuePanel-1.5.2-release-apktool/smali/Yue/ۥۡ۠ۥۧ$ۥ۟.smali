.class public final enum LYue/ۥۡ۠ۥۧ$ۥ۟;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡ۠ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LYue/\u06e5\u06e1\u06e0\u06e5\u06e7$\u06e5\u06df;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ۥۣ۟۟۠:LYue/ۥۡ۠ۥۧ$ۥ۟;

.field public static final enum ۥ۟۟۠ۤ:LYue/ۥۡ۠ۥۧ$ۥ۟;

.field public static final synthetic ۥ۟۟۠ۥ:[LYue/ۥۡ۠ۥۧ$ۥ۟;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x14b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, LYue/ۥۡ۠ۥۧ$ۥ۟;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۡ۠ۥۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, LYue/ۥۡ۠ۥۧ$ۥ۟;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYue/ۥۡ۠ۥۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۠ۥۧ$ۥ۟;

    new-instance v0, LYue/ۥۡ۠ۥۧ$ۥ۟;

    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥۡ۠ۥۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, LYue/ۥۡ۠ۥۧ$ۥ۟;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYue/ۥۡ۠ۥۧ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۡ۠ۥۧ$ۥ۟;

    invoke-static {}, LYue/ۥۡ۠ۥۧ$ۥ۟;->ۥ()[LYue/ۥۡ۠ۥۧ$ۥ۟;

    move-result-object v0

    sput-object v0, LYue/ۥۡ۠ۥۧ$ۥ۟;->ۥ۟۟۠ۥ:[LYue/ۥۡ۠ۥۧ$ۥ۟;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static native valueOf(Ljava/lang/String;)LYue/ۥۡ۠ۥۧ$ۥ۟;
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            null
        }
    .end annotation
.end method

.method public static native values()[LYue/ۥۡ۠ۥۧ$ۥ۟;
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ()[LYue/ۥۡ۠ۥۧ$ۥ۟;
.end method
