.class public final synthetic LYue/ۥۡۡۨۨ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/reflect/Method;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۦ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۨ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2e0

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۨۨ;->ۥۣ۟۟۠:Ljava/lang/reflect/Method;

    iput-object p2, p0, LYue/ۥۡۡۨۨ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۡۡۨۨ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    iput-object p4, p0, LYue/ۥۡۡۨۨ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput-object p5, p0, LYue/ۥۡۡۨۨ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    iput p6, p0, LYue/ۥۡۡۨۨ;->ۥ۟۟۠ۨ:I

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
