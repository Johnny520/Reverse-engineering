.class public final synthetic LYue/ۥ۠ۤۥۦ;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;


# instance fields
.field public final synthetic ۥ:I

.field public final synthetic ۥ۟:Lorg/json/JSONObject;

.field public final synthetic ۥ۟۟:[I

.field public final synthetic ۥ۟۟۟:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(ILorg/json/JSONObject;[ILjava/lang/Object;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥ۠ۤۥۦ;->ۥ:I

    iput-object p2, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟:Lorg/json/JSONObject;

    iput-object p3, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟۟:[I

    iput-object p4, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟۟۟:Ljava/lang/Object;

    iput-object p5, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟۟۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    return-void
.end method


# virtual methods
.method public final onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z
    .locals 8

    iget v0, p0, LYue/ۥ۠ۤۥۦ;->ۥ:I

    iget-object v1, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟:Lorg/json/JSONObject;

    iget-object v2, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟۟:[I

    iget-object v3, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟۟۟:Ljava/lang/Object;

    iget-object v4, p0, LYue/ۥ۠ۤۥۦ;->ۥ۟۟۟۟:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    move-object v5, p1

    check-cast v5, Lcom/kongzue/dialogx/dialogs/MessageMenu;

    move-object v6, p2

    move v7, p3

    invoke-static/range {v0 .. v7}, LYue/ۥ۠ۤۥۧ;->ۥ۟(ILorg/json/JSONObject;[ILjava/lang/Object;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Lcom/kongzue/dialogx/dialogs/MessageMenu;Ljava/lang/CharSequence;I)Z

    move-result p1

    return p1
.end method
