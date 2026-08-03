.class public final synthetic LYue/ۥۣۣۢۤ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ۥ:Lcom/yuexin/panel/myClass/itemInfo;

.field public final synthetic ۥ۟:Landroid/widget/Switch;

.field public final synthetic ۥ۟۟:Ljava/lang/Class;

.field public final synthetic ۥ۟۟۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/yuexin/panel/myClass/itemInfo;Landroid/widget/Switch;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۣۢۤ;->ۥ:Lcom/yuexin/panel/myClass/itemInfo;

    iput-object p2, p0, LYue/ۥۣۣۢۤ;->ۥ۟:Landroid/widget/Switch;

    iput-object p3, p0, LYue/ۥۣۣۢۤ;->ۥ۟۟:Ljava/lang/Class;

    iput-object p4, p0, LYue/ۥۣۣۢۤ;->ۥ۟۟۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final native onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end method
